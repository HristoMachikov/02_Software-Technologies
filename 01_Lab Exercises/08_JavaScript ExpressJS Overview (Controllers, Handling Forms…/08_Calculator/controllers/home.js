const Calculator = require('../models/Calculator');

module.exports = {
    indexGet: (req, res) => {
        res.render('home/index');
    },
    indexPost: (req, res) => {
        let calculatorBody = req.body;

        let calculatorParam = calculatorBody['calculator'];

        let calculator = new Calculator();
        calculator.leftOperand = Number(calculatorParam.leftOperand);
        calculator.operator = calculatorParam.operator;
        calculator.rightOperand = Number(calculatorParam.rightOperand);

        let result = calculator.calculateResult();

        res.render('home/index', {'calculator': calculator, 'result': result});
    }
};