<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
	<style>
		table * {
			border: 1px solid black;
			width: 50px;
			height: 50px;
		}
    </style>
</head>
<body>
<table>
    <tr>
        <td>
            Red
        </td>
        <td>
            Green
        </td>
        <td>
            Blue
        </td>
    </tr>
    <?php
    for ($i=1; $i<=5; $i++){
        $currentColor=51*$i;
        echo "<tr>";
        echo "<td style=\"background-color: rgb($currentColor,0,0)\" /td>";
        echo "<td style=\"background-color: rgb(0,$currentColor,0)\" /td>";
        echo "<td style=\"background-color: rgb(0,0,$currentColor)\" /td>";
        echo "</tr>";
    }
    ?>
</table>
</body>
</html>