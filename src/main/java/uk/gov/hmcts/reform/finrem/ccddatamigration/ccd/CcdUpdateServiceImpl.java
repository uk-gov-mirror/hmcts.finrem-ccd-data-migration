package uk.gov.hmcts.reform.finrem.ccddatamigration.ccd;

import org.springframework.stereotype.Service;
import uk.gov.hmcts.reform.ccd.client.model.CaseDetails;

@Service
public class CcdUpdateServiceImpl extends BaseCcdCaseService implements CcdUpdateService {

    @Override
    public CaseDetails update(String caseId, Object data, String eventId, String authorisation,
                              String eventSummary, String eventDescription, String caseType) {
        throw new UnsupportedOperationException("See DFR-2863");
    }
}
