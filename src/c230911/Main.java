package c230911;

import c230911.buffered.BufferedTest;
import c230911.byteStream.OutPutStreamTest;
import c230911.dataStream.DataStreamTest;
import c230911.dataStream.ObjectStreamTest;
import c230911.fileIo.FileIoTest;
import c230911.fileIo.SubTest;
import c230911.stream.MatchTest;
import c230911.stream.OptionTest;

public class Main {
	public static void main(String[] args) {
		//Save.
		MatchTest.test();
		OptionTest.test();
		OutPutStreamTest.test();
		FileIoTest.test();
		SubTest.test();
		BufferedTest.test();
		DataStreamTest.test();
		ObjectStreamTest.test();
		PathTest.test();
	}
}
