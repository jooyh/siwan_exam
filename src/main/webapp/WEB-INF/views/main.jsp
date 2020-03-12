<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>
<style>
    th {
        border : 1px solid black;
        margin : 30px;
        padding : 10px;
    }
    td{
        padding : 10px;
    }
    button{
        width : 100px;
        height : 40px;
    }
    input{
        height : 30px;
    }
</style>
<section class='contents'>
    <input type="text" id="lvl" />
    <button onclick="fn_submit()">등급상향</button>
    <div>
        <table>
            <colgroup>
                <col width="20%"/>
                <col width="20%"/>
                <col width="20%"/>
                <col width="20%"/>
                <col width="20%"/>
            </colgroup>
            <thead>
                <th><input type="checkbox" id="allChk"/></th>
                <th>NAME</th>
                <th>AGE</th>
                <th>GENDER</th>
                <th>BIRTH</th>
            </thead>
            <tbody>
            </tbody>
        </table>
    </div>

</section>
<script src="/resources/pagejs/main.js" ></script>
<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
