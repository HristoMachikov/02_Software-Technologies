<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
        N: <input type="text" name="num1" />
        M: <input type="text" name="num2" />
        <input type="submit" />
</form>
<ul>
    <?php
        if(isset($_GET['num1']) && isset($_GET['num2'])){
            $rows=intval($_GET['num1']);
            $cols=intval($_GET['num2']);

            for ($row=1; $row<=$rows; $row++){
                echo "\t<li>";
                echo "List $row\n";
                echo "\t\t\t<ul>\n";
                for ($col=1; $col<=$cols; $col++){
                    echo "\t\t\t\t<li>";
                    echo "Element $row.$col";
                    echo "</li>\n";
                }
                echo "\t\t\t</ul>\n";
                echo "\t\t</li>\n";
            }
        }
        ?>
</ul>
</body>
</html>