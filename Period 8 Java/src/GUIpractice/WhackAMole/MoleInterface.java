package GUIpractice.WhackAMole;

import GUIpractice.components.Action;
import GUIpractice.components.Clickable;

public interface MoleInterface extends Clickable {

	double getAppearanceTime();

	void setAction(Action action);

	void setAppearanceTime(double d);



	

}
