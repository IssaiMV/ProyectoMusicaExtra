<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>¡Bienvenido a nuestra pagina!</h1>
        <small>Tomaremos tu informacion para futuras referencias.</small>
        <form action="CrearSession" method="post">
            <fieldset>
                <legend>Información Personal</legend>
                Nombre: <input name='nombre' type='text' tabindex='1' maxlength="20" required>
            </fieldset>

            <fieldset>
                <legend>Generos Preferidos </legend>
                <input type='checkbox' tabindex='20'
                       name='genero' id="genero-1" value='Blues' > 
                <label for="genero-1"> Blues</label>
                <input type='checkbox' tabindex='21'
                       name='genero' id="genero-2" value='Country'> 
                <label for="genero-2"> Country</label>
                <input type='checkbox' tabindex='22'
                       name='genero' id="genero-3" value='Disco'> 
                <label for="genero-3"> Disco</label>
                <input type='checkbox' tabindex='23'
                       name='genero' id="genero-4" value='Heavy Metal'> 
                <label for="genero-4"> Heavy Metal</label>
                <input type='checkbox' tabindex='24'
                       name='genero' id="genero-5" value='Jazz'> 
                <label for="genero-5"> Jazz</label>
            </fieldset>
            <button type="submit" id="button">Enviar informacion</button>
        </form>
        <a href='/Musica/VerSession'>Ver informacion</a>
    </body>
</html>
