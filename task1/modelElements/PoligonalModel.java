package task1.modelElements;

import task1.stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonalModel(List<Texture> Textures) {
        this.Textures = Textures;
        Poligons = new ArrayList<>();
        List<Point3D> Result = new ArrayList();
        Poligons.add(new Poligon(Result));
    }
}
