<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Formulario</title>
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
    <h1>Login</h1>

    <form action="myServlet" method="post">
        Nombre: <input type="text" name="nombre" required><br><br>
        <input type="submit" value="Iniciar sesión">
    </form>
</div>

</body>
</html>