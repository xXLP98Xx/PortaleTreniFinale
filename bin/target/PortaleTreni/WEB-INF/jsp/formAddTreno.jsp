<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aggiungi</title>

<style>
        body {
            margin-left: 5%;
        }
        form div div span {
            margin: 0px 0px 0px 5px
        }
        form div div {
            margin: 0px 0px 5px 0px;
        }
        .error_message {
            color: red;
        }
        .error_input {
            border-width: 1px;
            border-color: red;
        }
    </style>


</head>
<body>
<%--${message}  --%>
<%=request.getAttribute("message")%>
<br>
 Inserisci Utente:
      <form:form method="POST" 
          action="add_treno"  modelAttribute="treno" >
          <td><form:errors path = "*" cssClass="error_message" >Ci sono Errori!!</form:errors></td>
           <table>
           			<!--utente_id deve essre preso dalla session-->
            	 <tr>
                    <td><form:label path="sigla">Utente ID</form:label></td>
                    <td><form:input path="sigla" cssErrorClass="error_input" /></td>
                    <td><form:errors path="sigla" cssClass="error_message" /></td>
                </tr>
               <tr>

                    <td><input type="submit" value="Submit"/></td>
                </tr>
                
            </table>
        </form:form>

</body>
</html>