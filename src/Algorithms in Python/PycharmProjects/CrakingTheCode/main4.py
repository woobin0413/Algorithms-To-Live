class Robot:
    def binCount(self, arr, size):
        if(bool(arr)):
            cache = []
            count = 0


            for i in range(0, len(arr)):
                # same value in cache array then remove the value
                if arr[i] in cache:
                    cache.remove(arr[i])
                else:
                    if (size == len(cache)):
                        cache[0].remove()

                    count += 1
                    cache.append(arr[i])
            return count
        else:
            print 'Nothing'

if __name__ == '__main__':
    new_robot = Robot()
    arr = ['33', '42', '21']
    print new_robot.binCount(arr, 10)

