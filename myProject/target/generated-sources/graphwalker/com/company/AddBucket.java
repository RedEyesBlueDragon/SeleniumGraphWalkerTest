// Generated by GraphWalker (http://www.graphwalker.org)
package com.company;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com/company/TestModel2.json")
public interface AddBucket {

    @Vertex()
    void v_ForMePage();

    @Vertex()
    void v_MainPage();

    @Vertex()
    void v_LoginPage();

    @Edge()
    void e_GoLoginPage();

    @Edge()
    void e_ClickAddtoCart();

    @Vertex()
    void v_PopUp();

    @Edge()
    void e_ClickDresses();

    @Edge()
    void e_GoMain();

    @Vertex()
    void v_DressPage();

    @Edge()
    void e_Login();

    @Vertex()
    void v_StartState();

    @Edge()
    void e_ClickDress();

    @Vertex()
    void v_SelectedDress();
}
