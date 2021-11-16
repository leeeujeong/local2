package ex5_instance_array;

public class Producer {

	private String name;

	public Producer(String name) {
		super();                                    // 컨스턱 유징...
		this.name = name;
	}
	
	
	public void produce(Singer singer, Song song) {
		singer.addSong(song);                         // 이미 다 구현 했음...(객체지향 프로그램)
	}
	
	
	
}
