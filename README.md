## springboot-keycloak-samle
    Example how to integrate Springboot with keycloak
### keycloak on docker
```
 $ docker run -p 8080:8080 --name keycloak -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:17.0.0 start-dev
```
# Keycloak Console config
 - Realm: myrealm
 - client: myapp
   - Service Accounts Enabled: true
   - Access Type: confidential
 - create users with role user or not

