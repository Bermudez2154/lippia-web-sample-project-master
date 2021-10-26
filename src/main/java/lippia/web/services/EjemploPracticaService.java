package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.EjemploPracticaConstants;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.Assert;

import javax.swing.*;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class EjemploPracticaService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickButton(){
        click(EjemploPracticaConstants.BUTTON_SIGNIN_XPATH);
    }

    public static void verificarSignInPage(){
        waitVisibility(EjemploPracticaConstants.INPUT_ADDRESS_XPATH);
        Assert.assertTrue(isVisible(EjemploPracticaConstants.INPUT_ADDRESS_XPATH));
        waitVisibility(EjemploPracticaConstants.H1_TITULO_XPATH);
        Assert.assertEquals(getText(EjemploPracticaConstants.H1_TITULO_XPATH),"AUTHENTICATION","No se encuentra el titulo");
    }

    public static void verificarMyAccountPage(){
        waitVisibility(EjemploPracticaConstants.WELCOME_TEXT_XPATH);
        Assert.assertTrue(isVisible(EjemploPracticaConstants.WELCOME_TEXT_XPATH));
        waitVisibility(EjemploPracticaConstants.H1_MYACCOUNT_XPATH);
        Assert.assertEquals(getText(EjemploPracticaConstants.H1_MYACCOUNT_XPATH),"MY ACCOUNT","No se encuentra el titulo");
    }

    public static void buscardatos(String busca){
        click(EjemploPracticaConstants.SEARCH_INPUT_XPATH);

    }

    public static void clickSearchButton(){
        click(EjemploPracticaConstants.SEARCH_BUTTON_XPATH);
    }

    public static void verificaResultado(){
        waitVisibility(EjemploPracticaConstants.SEARCH_XPATH);
    }

    public static void ingresarUsuario(String usuario){
        waitVisibility(EjemploPracticaConstants.USER_INPUT_XPATH);
        setInput(EjemploPracticaConstants.USER_INPUT_XPATH, usuario);

    }
    public static void ingresarPass(String pass){
        waitVisibility(EjemploPracticaConstants.PASS_INPUT_XPATH);
        setInput(EjemploPracticaConstants.PASS_INPUT_XPATH, pass);
    }

    public static void clickSubmitButton(){
        waitVisibility(EjemploPracticaConstants.SUBMIT_BUTTON_XPATH);
        click(EjemploPracticaConstants.SUBMIT_BUTTON_XPATH);
    }

    public static void completarDatos(String datos){
        waitVisibility(EjemploPracticaConstants.SEARCH_INPUT_XPATH);
        setInput(EjemploPracticaConstants.SEARCH_INPUT_XPATH, datos);

    }
    public static void ordenarDeMenorAMayor() {
        waitVisibility(EjemploPracticaConstants.TEXT_VISIBLE_XPATH);
        click(EjemploPracticaConstants.ORDEN_SELECCION_XPATH);
    }
}
