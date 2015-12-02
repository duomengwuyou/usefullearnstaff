package designpattern.facade;

/**
 * 门面模式  通过该门面调用模块的方法
 * @author Administrator
 *
 */
public class FacadeModule {
	ModuleA ma = new ModuleA();
	ModuleB mb = new ModuleB();
	
	public void a1(){
		ma.a1();
	}
	
	public void b2(){
		mb.b2();
	}
}
