<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Celsius-Fahrenheit</title>
</head>
<body>
    <form>
        Celsius:
        <input type="text" name="cel" />
        <input  type="submit" value="Convert" />
    </form>
    <form>
        Fahrenheit:
        <input type="text" name="fah" />
        <input  type="submit" value="Convert" />
    </form>

    <?php
    function celsiusToFahrenheit($celsius): float
    {
        return $celsius*1.8 + 32;
    }
    function fahrenheitToCelsius($fahrenheit): float
    {
        return ($fahrenheit - 32)/1.8;
    }
    $msgAfterCelsius="";
    if(isset($_GET['cel'])) {
        $celsius = floatval($_GET['cel']);
        $fahrenheit=(celsiusToFahrenheit($celsius));
        $msgAfterCelsius="$celsius &deg;C = $fahrenheit &deg;F";
        echo $msgAfterCelsius;
    }
    $msgAfterFahrenheit="";
    if(isset($_GET['fah'])) {
        $fahrenheit = floatval($_GET['fah']);
        $celsius=(fahrenheitToCelsius($fahrenheit));
        $msgAfterFahrenheit="$fahrenheit &deg;F = $celsius &deg;C";
        echo $msgAfterFahrenheit;
    }
    ?>
</body>
</html>