package designpattern.state;

/**
 * 
 *	状态模式和策略模式的不同就在于，状态模式是根据Context里面的状态的变化，调用不同的状态去展现。而策略模式是根据输入环境中的变量是什么来进行不同的策略实施。
 *
 */
public class Client {
	public static void main(String[] args){
		Context c = new Context();
		
		for(int i = 0; i < 10; i++){
			c.operate();
		}
	}
}
