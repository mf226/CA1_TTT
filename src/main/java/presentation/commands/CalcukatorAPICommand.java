/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.exceptions.OurException;

/**
 *
 * @author mich5
 */
public class CalcukatorAPICommand implements ICommand {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws OurException {
        return "calculator";
    }
    
}
