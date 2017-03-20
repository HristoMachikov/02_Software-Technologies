<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
    <?php
    if(isset($_GET['num'])){
        $num=intval($_GET['num']);
        $array=array();
        $currentNumb=0;
        for ($i=1; $i<=$num; $i++){
            if($i<=2){
                $currentNumb=1;
                $array[$i]=$currentNumb;
            } else{
                $currentNumb=$array[($i-1)]+$array[($i-2)];
                $array[$i]=$currentNumb;
            }
        }
        echo implode(" ",$array);
    }
    ?>
</body>
</html>