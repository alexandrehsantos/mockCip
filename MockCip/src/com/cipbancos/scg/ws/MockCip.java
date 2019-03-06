package com.cipbancos.scg.ws;

import javax.jws.WebService;

import com.cipbancos.scg.util.ConfigUtil;
import com.cipbancos.scg.util.MessageUtil;
import com.cipbancos.scg.webservice.ControleGarantia;
import com.cipbancos.scg.webservice.dto.SCGRequest;
import com.cipbancos.scg.webservice.dto.SCGResponse;

@WebService
public class MockCip implements ControleGarantia {
	private static final int STATUS_FINALIZADO = 0;

	public SCGResponse executeOperation(SCGRequest scgRequest) {
		String fileContent = new String(scgRequest.getRequest());
		SCGResponse scgResponse = new SCGResponse();
		scgResponse.setConfirmation("recebido");
		scgResponse.setStatus(0);
		outputMessages(fileContent);
		return scgResponse;
	}

	private void outputMessages(String fileContent) {
		MessageUtil.resquestMessages(fileContent);
	}

	public SCGResponse retryByConfirmationOperation(String confirmation) {
		return null;
	}

	public SCGResponse retryByIdOperation(String id) {
		return null;
	}

	// public String converter(String nome)
	// {
	// StringBuilder fileToByte = fileToHexString(nome);
	// return fileToByte.toString();
	// }
	//
	// private StringBuilder fileToHexString(String nome)
	// {
	// try
	// {
	// File file = new File(FileUtil.getParentPath() + getPathSeparator() + nome);
	// return FileUtil.convertToHex(file);
	// }
	// catch (URISyntaxException|IOException e)
	// {
	// throw new WebServiceException(e);
	// }
	// }

	public static String getPathSeparator() {
		ConfigUtil.SystemOS systemOS = ConfigUtil.detectOperatingSystem();

		String pathSeparator = null;
		if (systemOS.equals(ConfigUtil.SystemOS.UNIX)) {
			pathSeparator = "/";
		} else if (systemOS.equals(ConfigUtil.SystemOS.WINDOWS)) {
			pathSeparator = "\\";
		}
		return pathSeparator;
	}

}
