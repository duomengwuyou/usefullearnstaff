package designpattern.builder;
import java.util.ArrayList;

public abstract class AbstractCarBuilder {

	public abstract void setSequence(ArrayList<String> seq);

	public abstract CarModel getCarModel();
}
