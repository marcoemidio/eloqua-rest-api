INSERT INTO email_tbl (id, status, name, type, payload) 
VALUES (1, 
'INIT',
'REST Low Volume 01',
'EmailLowVolumeDeployment', 
'{ "type": "EmailLowVolumeDeployment", "name": "REST Low Volume 01", "contactIds": [ "1", "2" ], "email": { "type": "Email", "id": "101", "name": "test01" }, "signatureRuleId": "1", "notificationEmailAddress": "api.user@test.oracle.com", "sendDate": "1468622700", "sendOptions": { "allowResend": "true", "allowSendToUnsubscribe": "false" } }' );

INSERT INTO email_tbl (id, status, name, type, payload) 
VALUES (2, 
'INIT',
'REST Low Volume 02',
'EmailLowVolumeDeployment', 
'{ "type": "EmailLowVolumeDeployment", "name": "REST Low Volume 02", "contactIds": [ "3538" ], "email": { "type": "Email", "id": "294", "name": "294" }, "sendOptions": { "allowResend": "true", "allowSendToUnsubscribe": "false" } }' );

INSERT INTO email_tbl (id, status, name, type, payload) 
VALUES (2, 
'INIT',
'REST Test 01',
'EmailLowVolumeDeployment', 
'{ "type": "EmailLowVolumeDeployment", "name": "REST Test 01", "contactIds": ["3468"], "email": { "type": "Email", "id": "883", "name": "Test001" }, "sendOptions": { "allowResend": "true", "allowSendToUnsubscribe": "false" } }');