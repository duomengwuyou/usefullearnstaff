package designpattern.factory;

public abstract class AbstractHumanFactory {
	public abstract Human createHuman(Class<? extends Human> c);
}
