package ru.job4j.loop;

public class Paint {

    public String piramid(int h){

		int width = 2*h-1;
        StringBuilder builder = new StringBuilder();
		
	for (int indexHeight = 1; indexHeight <= h; indexHeight++){
	
		for (int indexWidth = 1; indexWidth <= width; indexWidth++){
			
		builder.append(	indexWidth < h && indexWidth >= h - indexHeight + 1  ||
						indexWidth > h && indexWidth <= h + indexHeight - 1  ||
                        indexWidth == h ?  'V' : ' ');
		}
		builder.append(System.getProperty("line.separator"));
		}
		return builder.toString();
	}
}

