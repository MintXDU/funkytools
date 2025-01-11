cd /funkytools/target # 进入 JAR 文件所在目录
pkill -f "funkytools-0.0.1-SNAPSHOT.jar"  || true # 停止之前的 JAR 包
nohup java -jar funkytools-0.0.1-SNAPSHOT.jar > app.log 2>&1 & # 启动 JAR 包，并将日志输出到 app.log