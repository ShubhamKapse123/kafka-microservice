# kafka-microservice

This Basic project to learn kafka

## Massage Broker

### Why

1. It High Throughput as compare to database.<br>
2. It is the fault tolerance(don't loss any data if anything unexpectedly happen) because of replication(create multiple nodes and every node store the copy of data.main node is leader. if leader is fail then others have a backup and from others someone will be become a leader).<br>
3. Durable
4. Scalable

## Components

1. Producer - Producer the massage

2. consumer - Consume the massage

3. Kafka Ecosystem
 i. Kafka Cluster 
 ii. Zookeeper - help to mange the state of brokers.

4. Brokers(Servers)- this may be multiple. store the data in broker and every broker have multiple topics. 

5. Topics - This is use for categorizing the data. topics are multiple.

6. Partitions - every topic have multiple partitions. 


