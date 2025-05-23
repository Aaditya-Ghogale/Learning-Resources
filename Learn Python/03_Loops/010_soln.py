import time

wait_time=1
max_time=5
attempt=0

while attempt < max_time:
    print("Attempts :", attempt+1, " waiting for ", wait_time, " seconds")
    time.sleep(wait_time)
    wait_time *= 2
    attempt += 1
    