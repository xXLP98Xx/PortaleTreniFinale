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
<br>
 Inserisci Utente:
      <form:form method="POST" 
          action="add"  modelAttribute="utente" >
          <td><form:errors path = "*" cssClass="error_message" >Ci sono Errori!!</form:errors></td>
           <table>
            	 <tr>
                    <td><form:label path="username">Username</form:label></td>
                    <td><form:input path="username" cssErrorClass="error_input" /></td>
                    <td><form:errors path="username" cssClass="error_message" /></td>
                </tr>
				 <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:input path="password" type="password" cssErrorClass="error_input" /></td>
                    <td><form:errors path="password" cssClass="error_message" /></td>
                </tr>
                <tr>
                    <td><form:label  path="nome" >Nome</form:label></td>
                    <td><form:input  path="nome" cssErrorClass="error_input" /></td>
                    <td><form:errors path="nome" cssClass="error_message" /></td>
                </tr>
                <tr>
                    <td><form:label path="cognome">Cognome</form:label></td>
                    <td><form:input path="cognome" cssErrorClass="error_input" /></td>
                    <td><form:errors path="cognome" cssClass="error_message" /></td>
                </tr>
				<tr>
				    <td><form:label path="dataDiNascita">Data di Nascita</form:label></td>
				    <td><form:input path="dataDiNascita" type="date" cssErrorClass="error_input" /></td>
				    <td><form:errors path="dataDiNascita" cssClass="error_message" /></td>
				</tr>

                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>

</body>
</html>
