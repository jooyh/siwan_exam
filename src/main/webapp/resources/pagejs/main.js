
//initialize page
fn_init = function(){
	var userData = mkUserData();
	mkRow(userData);
}

// Event ( thead check box click )
$("#allChk").on("click",function(e){
	if($(e.target).is(":checked")){
		$(".chk").prop("checked", true);
	}else{
		$(".chk").prop("checked", false);
	}
});

// Event ( row click )
$("table").on("click",function(e){
	console.log($(e.target));
	var rowChk = $(e.target).parents("tr").find(".chk");
	var checkFlag = $(rowChk).is(":checked");
	if(checkFlag) $(rowChk).prop("checked",false);
	else $(rowChk).prop("checked",true);
});

// Submit function (Send data to Server)
function fn_submit(){

	/*
	 * [notice] Object 형태와 Jquery의 Serialize의 형태는 다름.
	 *
	 * JSON.stringify > 직렬화 를 해주어야 Server 단에서 데이터 적재 가능
	 * userVOList > VO 내부에 List 변수명과 매칭시켜주어야 데이터 적재 가능
	 * contentType : "application/json" > @RequestBody 어노테이션으로 파라미터를 전달받기 위함
	 */

	//원래 VO 형태의 Object List
	var orgDataList = mkDataForServer();
	console.log("orgDataList",orgDataList);
	//VO 안의 리스트 변수명으로 파싱하기위해 userVOList키 값을 갖는 Object로 감싸줌
	var coverDataForVoMatch = {userVOList : mkDataForServer()};
	console.log("coverDataForVoMatch",coverDataForVoMatch);
	//서버단에서 데이터를 전달받기위해 JSON.stringify 함수로 직렬화
	var serializedData = JSON.stringify(coverDataForVoMatch);
	console.log("serializedData",serializedData);

	$.ajax({
		 url : "/testSubmit"
		,type:"post"
		,data : serializedData
		,contentType : "application/json"
		,success: function(result){
			console.log(result);
		}
		,error:function(error){
			console.error(error);
		}
	});
}

//Make data for server ( @ReturnType = Object )
function mkDataForServer(){
	var dataList = [];
	$(".chk:checked").each(function(i,item){
		var data = $(item).attr("data");
		data = JSON.parse(data);
		data.userLvl = $("#lvl").val();
		dataList.push(data);
	});
	return dataList;
}

// Append table row
function mkRow(data){
	var html = ``;
	for(var i in data){
		html += `
		<tr>
			<td><input type="checkbox" class="chk" id="chk${i}"
			data='${JSON.stringify(data[i])}'></td>
			<td>${data[i].name}</td>
			<td>${data[i].age}</td>
			<td>${data[i].gender}</td>
			<td>${data[i].birth}</td>
		</tr>
		`
	}
	$("tbody").empty().append(html);
}

