package com.ardublock.translator.block.Engduino;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class EngduinoAccelerometer_x extends TranslatorBlock {

	public EngduinoAccelerometer_x (Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}
	
	//@Override
		public String toCode() throws SocketNullException, SubroutineNotDeclaredException
		{
			String ret="";
			
			translator.addHeaderFile("EngduinoAccelerometer.h");
			translator.addHeaderFile("Wire.h");
			translator.addSetupCommand("EngduinoAccelerometer"+".begin();\n");
			
			ret += "\tEngduinoAccelerometer.getX();\n";
			return ret;
		}
}
