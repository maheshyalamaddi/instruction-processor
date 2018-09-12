package com.instruction.processor.util;

import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface InstructionConstants {

	public static final String CURRENCY_AED = "AED";
	public static final String CURRENCY_SAR = "SAR";
	public static final String CURRENCY_OTHER = "OTHER";
	public static final String INCOMING_TRADING = "B";
	public static final String OUTGOING_TRADING = "S";

	public static final Map<Integer, String> DAY_OF_WORK_WEEK_FOR_OTHERS = initOthersMap();

	static Map<Integer, String> initOthersMap() {
		Map<Integer, String> mapObject = new HashMap<>();
		mapObject.put(Calendar.MONDAY, "MONDAY");
		mapObject.put(Calendar.TUESDAY, "TUESDAY");
		mapObject.put(Calendar.WEDNESDAY, "WEDNESDAY");
		mapObject.put(Calendar.THURSDAY, "THURSDAY");
		mapObject.put(Calendar.FRIDAY, "FRIDAY");
		return Collections.unmodifiableMap(mapObject);
	}

	public static final Map<Integer, String> DAY_OF_WORK_WEEK_FOR_AED_N_SAR = initAedNSarMap();

	static Map<Integer, String> initAedNSarMap() {
		Map<Integer, String> mapObject = new HashMap<>();
		mapObject.put(Calendar.SUNDAY, "SUNDAY");
		mapObject.put(Calendar.MONDAY, "MONDAY");
		mapObject.put(Calendar.TUESDAY, "TUESDAY");
		mapObject.put(Calendar.WEDNESDAY, "WEDNESDAY");
		mapObject.put(Calendar.THURSDAY, "THURSDAY");
		return Collections.unmodifiableMap(mapObject);
	}
}