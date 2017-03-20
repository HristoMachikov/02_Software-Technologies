<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Multiply A Number By 2</title>
</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
<?php
if(isset($_GET['num'])){
    $result=intval($_GET['num']);
    echo $result*2;
}
?>
</body>
</html>