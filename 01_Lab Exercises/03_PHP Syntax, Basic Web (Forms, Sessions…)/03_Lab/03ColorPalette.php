<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Color Palette</title>
    <link type="text/css" rel="stylesheet"  href="03_CSS.css"/>
</head>
<body>
    <?php
    for ($red=0; $red<=255; $red+=51)
        for ($green=0; $green<=255; $green+=51)
            for ($blue=0; $blue<=255; $blue+=51){
       $color="rgb($red,$green,$blue)";
        echo "<div style='background: $color; display: inline-block; width: 200px; padding: 5px; margin:5px;'> $color</div>";
    }
    ?>
</body>
</html>

