package cogent_Assis;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Segment {

	public static void main(String[] args) {
		
		List<Integer> space=new ArrayList<Integer>();
		space.add(2);
		space.add(5);
		space.add(4);
		space.add(6);
		space.add(8);
		System.out.println(segment(3,space));
	}

	public static int segment(int x, List<Integer> space) {
		// x number of segment
		
		int chunkNum = 1;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for(int i = 1; i < space.size(); i++){
            if(i < x){               if(space.get(i) < space.get(s.peek())){
                    s.pop();      s.push(i);    }    } else {
                int peek = s.peek();  if(peek >= chunkNum){
                    s.push(space.get(i) < space.get(peek) ? i : peek);
                } else {  s.push(i);
                    int j = chunkNum;
                    int count = 0;
                    while(count++ < x){
                        if(space.get(j) < space.get(s.peek())){
                            s.pop();
                            s.push(j);
                        }
                        j++;
                    }
                }
                chunkNum++;
            }
	}
        return chunkNum;

}
}
