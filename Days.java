public class Days{
	public static void main(String[] args) {
		int bln = Integer.parseInt(System.console().readLine());
		int thn = Integer.parseInt(System.console().readLine());
		switch(thn%400){
			case 0: {
				switch(bln){
					case 2: System.out.println("29 hari"); break;
					case 1: 
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12: System.out.println("31 hari"); break;
					default: System.out.println("30 hari"); break;
				}
			} break;
			default: {
				switch(thn%100){
					case 0: {
						switch(bln){
							case 2: System.out.println("28 hari"); break;
							case 1: 
							case 3:
							case 5:
							case 7:
							case 8:
							case 10:
							case 12: System.out.println("31 hari"); break;
							default: System.out.println("30 hari"); break;
						}
					} break;
					default: {
						switch(thn%4){
							case 0: {
								switch(bln){
									case 2: System.out.println("29 hari"); break;
									case 1: 
									case 3:
									case 5:
									case 7:
									case 8:
									case 10:
									case 12: System.out.println("31 hari"); break;
									default: System.out.println("30 hari"); break;
								}
							} break;
							default : {
								switch(bln){
									case 2: System.out.println("28 hari"); break;
									case 1: 
									case 3:
									case 5:
									case 7:
									case 8:
									case 10:
									case 12: System.out.println("31 hari"); break;
									default: System.out.println("30 hari"); break;
								}
							}break;
						}
					} break;
				}
			} break;
		}
	}
}