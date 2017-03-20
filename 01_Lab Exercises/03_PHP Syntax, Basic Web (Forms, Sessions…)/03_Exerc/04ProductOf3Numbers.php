<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product Of 3 Numbers</title>

</head>
<body>
    <form>
        X: <input type="text" name="num1" />
		Y: <input type="text" name="num2" />
        Z: <input type="text" name="num3" />
		<input type="submit" />
    </form>
	<?php
    if(isset($_GET['num1']) && isset($_GET['num2']) && isset($_GET['num3'])){
        $all=array($_GET['num1'],$_GET['num2'],$_GET['num3']);
        $counter=0;
        $zeroCheck=0;
        foreach ($all as $value){
            if(intval($value)<0){
                $counter=$counter+1;
            }
            if(intval($value)==0){
                $zeroCheck+=1;
            }
        }
        if($zeroCheck>0){
            echo "Positive";
        } else {
            if ($counter % 2 == 0) {
                echo "Positive";
            } else {
                echo "Negative";
            }
        }
    }
    ?>
</body>
</html>