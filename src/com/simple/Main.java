package com.simple;

import com.simple.control.AlgorithmControl;
import com.simple.control.FoodItemControl;
import com.simple.control.RecepieControl;
import com.simple.control.UserControl;
import com.simple.model.Algorithm;
import com.simple.model.Food;
import com.simple.model.Recipe;
import com.simple.model.User;
import com.simple.view.*;

public class Main {

    public static void main(String[] args) {System.out.println("Hello world!");

        //Create all classes!
        Algorithm algorithmModel = new Algorithm();
        AlgorithmControl algorithmControl = new AlgorithmControl();

        Food foodModel = new Food();
        FoodItemControl foodControl = new FoodItemControl();
        FoodItemView foodView = new FoodItemView();

        Recipe recipeModel = new Recipe();
        RecepieControl recepieControl = new RecepieControl();
        RecipeView recipeView = new RecipeView();

        User user = new User();
        UserControl userControl = new UserControl();
        UserView userView = new UserView();

        StartView startView = new StartView();
        WeekmenuView weekmenuView = new WeekmenuView();

        StartView.connectControl(algorithmControl);
        algorithmControl.connectModel(algorithmModel);



    }
}
