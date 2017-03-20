<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
<?php
$array=[
    [1,1,1,1,1],
    [1,0,0,0,0],
    [1,0,0,0,0],
    [1,0,0,0,0],
    [1,1,1,1,1],
    [0,0,0,0,1],
    [0,0,0,0,1],
    [0,0,0,0,1],
    [1,1,1,1,1]
];
for ($row=0; $row<9; $row++){
    for ($col=0; $col<5; $col++){
        $currentNumber=$array[$row][$col];
        if($currentNumber==1){
            echo "<button style='background-color: blue'>$currentNumber</button>";
        }else{
            echo "<button>$currentNumber</button>";
        }

    }
    echo "<br/>";
}
?>
</body>
</html>