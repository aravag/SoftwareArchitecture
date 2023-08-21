package task1.memoryModel;

import java.util.ArrayList;
import java.util.List;

import task1.modelElements.Camera;
import task1.modelElements.Flash;
import task1.modelElements.PoligonalModel;
import task1.modelElements.Scene;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangeObserver> changeObservers;

    public ModelStore(List<IModelChangeObserver> changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }

    public Scene getScena(int id) {
        for (int i = 0; i < Scenes.size(); i++) {
            if(Scenes.get(i).Id == id)
                return Scenes.get(i);
        }
        return null;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
