<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sum Two Numbers</title>
</head>
<body>
    <form>
        <div>First Number:</div>
        <input type="text" name="num1" />
        <div>Second Number:</div>
        <input type="text" name="num2" />
        <div><input  type="submit" /></div>
    </form>
    <?php
    if(isset($_GET['num1']) && isset($_GET['num2'])) {
        $firstNumber = intval($_GET['num1']);
        $secondNumber = intval($_GET['num2']);
        $sum = $firstNumber + $secondNumber;
        echo "$firstNumber $secondNumber $sum ";
    }
    ?>
</body>
</html>