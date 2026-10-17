
prices = [500, 1200, 2000, 800, 1500]

def discounted_price(price):
    if price > 1000:
        return price * 0.80
    return price


discounted = list(map(discounted_price, prices))


eligible = list(filter(lambda price: price > 1000, prices))

print("Original prices:", prices)
print("Eligible products:", eligible)
print("Prices after discount:", discounted)
