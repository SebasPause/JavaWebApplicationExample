<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title>Bienvenido</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .contenedor {
            border: 2px solid black;
            padding: 30px;
            text-align: center;
            width: 300px;
            border-radius: 10px;
        }
    </style>
</head>
<body>
    <div class="contenedor">
        <h1>Bienvenido ${nombre} !!</h1>
        <br>

        <form action="login.jsp" method="GET">
            <input type="submit" value="Cerrar sesión" style="padding:10px 20px; font-size:16px;">
        </form>
    </div>
</body>
</html>
