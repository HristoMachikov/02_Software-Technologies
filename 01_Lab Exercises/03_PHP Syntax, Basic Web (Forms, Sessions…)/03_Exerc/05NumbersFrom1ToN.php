<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Numbers From 1 To N</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
	<?php
    if(isset($_GET['num'])){
        $num=intval($_GET['num']);
        if($num >0){
            for($i=1; $i<=$num; $i++){
                echo "$i ";
            }
        }
    }
    ?>
</body>
</html>