<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<a href="/login">Login</a>
<br><br>
<form action="/api/person" method="post">
    <input type="text" name="firstname" placeholder="Enter First Name">
    <input type="text" name="lastname" placeholder="Enter Last Name">
    <input type="number" name="national-code" placeholder="Enter National Code">
    <input type="submit" value="Save">
</form>

<p id="person-para">No Person</p>
<button onclick="getPersons()">Get Persons</button>
<script>
    function getPersons(){
        fetch('http://localhost:80/api/person/test')
            .then(async response => {
                const isJson = response.headers.get('content-type')?.includes('application/json');
                const data = isJson ? await response.json() : null;
                if (!response.ok) {
                    const error = (data && data.message) || response.status;
                    return Promise.reject(error);
                }

                document.getElementById("person-para").innerText = JSON.stringify(data);
            })
            .catch(error => {
                document.getElementById("person-para").innerText = JSON.stringify(data);
            });
    }
</script>
</body>
</html>