public class CmdArguments {
	
	public static void main(String[] args) {
		
		//System.out.print(args.length);
		StringBuffer values =  new StringBuffer();
		
		if(args.length <1) {
			System.out.print("No values");
		}else {
			
			for (int i = 0; i < args.length; i++) {
				
				values.append(args[i]);
				
				if(i<args.length-1)
					values.append(",");
					
			}
		}
		System.out.print(values);
		
	}

}
