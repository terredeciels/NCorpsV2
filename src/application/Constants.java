package application;

import javafx.scene.paint.Color;

class Constants {

    static int W = 1200;
    static int H = 600;
    static Color graphicsContextsetFill = Color.BLACK;
    static Color color_ball_center = Color.BLUE;
    static Color color_ball = Color.WHITE;

    static int NbParticules = 300;
    //static double DeltaT = 0.005;
    static double DeltaT = 0.0020;

    static double Diam_M_Centre = 10;
    static double diam_part_fact = 1;
    //static double M_centre = 10000.0;
    static double M_centre = 10.0;
    static double m_part = 1.0;

    //static double dist_collision = 0.1;
    static double dist_collision = 0.01;
    //couronne
    static double R = 150;
    //static double ep = 25;
    static double ep = 20;
    //static double multiply_vit_pos = 2000;// 1 ou > 300, 2000
    static double multiply_vit_pos = 10000;// 1 ou > 300, 2000
    static double multiply_vit_neg = 200;// 1 ou > 300, 2000

}
