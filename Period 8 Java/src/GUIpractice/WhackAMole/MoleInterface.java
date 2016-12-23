package GUIpractice.WhackAMole;

import GUIpractice.components.Action;
import GUIpractice.components.Clickable;

public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearanceTime(int i);

	void setAction(Action action);



	

}
