package designpattern.iterator;

/**
 * 迭代器接口  实现两个方法：获取下一个元素以及判断是否存在下一个元素
 * @author Administrator
 *
 */
public interface IteratorInterface {
	public Object next();
	public boolean hasNext();
}
