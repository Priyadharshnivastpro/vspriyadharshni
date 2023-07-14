package fridaytask;

public interface Playable {
	void play(); 

}
class Guitar implements Playable{
	
	
	public void play() {
		System.out.println("Play the Guitar");
	}
	
}
class Piano implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play the piano");
		
	}
	
}
