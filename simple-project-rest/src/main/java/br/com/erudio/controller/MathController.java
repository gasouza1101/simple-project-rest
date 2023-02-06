package br.com.erudio.controller;

import br.com.erudio.utils.NumericTreatment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    public NumericTreatment formatNumber;
    @RequestMapping(value = "sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if(!formatNumber.isNumeric(numberOne) || !formatNumber.isNumeric(numberTwo)) throw new Exception();

        return formatNumber.convertDouble(numberOne) + formatNumber.convertDouble(numberTwo);
    }
    @RequestMapping(value = "sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if(!formatNumber.isNumeric(numberOne) || !formatNumber.isNumeric(numberTwo)) throw new Exception();

        return formatNumber.convertDouble(numberOne) - formatNumber.convertDouble(numberTwo);
    }
    @RequestMapping(value = "mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mult(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if(!formatNumber.isNumeric(numberOne) || !formatNumber.isNumeric(numberTwo)) throw new Exception();

        return formatNumber.convertDouble(numberOne) * formatNumber.convertDouble(numberTwo);
    }
    @RequestMapping(value = "div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if(!formatNumber.isNumeric(numberOne) || !formatNumber.isNumeric(numberTwo)) throw new Exception();

        return formatNumber.convertDouble(numberOne) / formatNumber.convertDouble(numberTwo);
    }


}
