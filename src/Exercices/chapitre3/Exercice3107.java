package Exercices.chapitre3;

import utils.Vector2D;

import java.util.ArrayList;
import java.util.List;

public class Exercice3107 {

    private Vector2D F1, F2, F3, F4, R;
    private final double r_AB = 9;

    public Exercice3107() {
        this.F1 = new Vector2D(0.0, -1300.0);
        this.F2 = new Vector2D(0.0, -400.0);
        this.F3 = new Vector2D(0.0, -600.0);
        this.R = new Vector2D(0, -(F1.norm() + F2.norm() + F3.norm()));

    }
}
