# shiro-example

```bash
# サーバー起動
mvn liberty:dev

# ログインしているユーザーならアクセス可能
curl -v -u myviewer:mypassword http://localhost:9080/shiro-example/api/shiro

# 権限が付与されたユーザーのみアクセス可能
curl -v -u myuser:mypassword http://localhost:9080/shiro-example/api/shiro/define
```
