# Kustomize

```
#####------------Set up Deployment and Service Using Kustomize tool---------######
####Not using Overlays because we do not need environment specific configurations here#########
```
kubectl kustomize kustomize/application/ | kubectl apply -f -
# OR
kubectl apply -k kustomize/application/

#Verify if all up and running
kubectl get all -n technical-test

#Bring down the stack
kubectl delete ns technical-test



